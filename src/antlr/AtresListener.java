// Generated from Atres.g4 by ANTLR 4.13.1

	package antlr;
	import java.util.*;
	import java.util.Scanner;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AtresParser}.
 */
public interface AtresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AtresParser#comeco}.
	 * @param ctx the parse tree
	 */
	void enterComeco(AtresParser.ComecoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#comeco}.
	 * @param ctx the parse tree
	 */
	void exitComeco(AtresParser.ComecoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AtresParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AtresParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#declararpv}.
	 * @param ctx the parse tree
	 */
	void enterDeclararpv(AtresParser.DeclararpvContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#declararpv}.
	 * @param ctx the parse tree
	 */
	void exitDeclararpv(AtresParser.DeclararpvContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(AtresParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(AtresParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#atribuirpv}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirpv(AtresParser.AtribuirpvContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#atribuirpv}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirpv(AtresParser.AtribuirpvContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuir(AtresParser.AtribuirContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuir(AtresParser.AtribuirContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#pegarpv}.
	 * @param ctx the parse tree
	 */
	void enterPegarpv(AtresParser.PegarpvContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#pegarpv}.
	 * @param ctx the parse tree
	 */
	void exitPegarpv(AtresParser.PegarpvContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#pegar}.
	 * @param ctx the parse tree
	 */
	void enterPegar(AtresParser.PegarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#pegar}.
	 * @param ctx the parse tree
	 */
	void exitPegar(AtresParser.PegarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(AtresParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(AtresParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(AtresParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(AtresParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void enterExprcomp(AtresParser.ExprcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void exitExprcomp(AtresParser.ExprcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#compstr}.
	 * @param ctx the parse tree
	 */
	void enterCompstr(AtresParser.CompstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#compstr}.
	 * @param ctx the parse tree
	 */
	void exitCompstr(AtresParser.CompstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AtresParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AtresParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#exprmath}.
	 * @param ctx the parse tree
	 */
	void enterExprmath(AtresParser.ExprmathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#exprmath}.
	 * @param ctx the parse tree
	 */
	void exitExprmath(AtresParser.ExprmathContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#adcsub}.
	 * @param ctx the parse tree
	 */
	void enterAdcsub(AtresParser.AdcsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#adcsub}.
	 * @param ctx the parse tree
	 */
	void exitAdcsub(AtresParser.AdcsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#multdiv}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(AtresParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#multdiv}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(AtresParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(AtresParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(AtresParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AtresParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AtresParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#textovariavel}.
	 * @param ctx the parse tree
	 */
	void enterTextovariavel(AtresParser.TextovariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#textovariavel}.
	 * @param ctx the parse tree
	 */
	void exitTextovariavel(AtresParser.TextovariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(AtresParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(AtresParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#paracada}.
	 * @param ctx the parse tree
	 */
	void enterParacada(AtresParser.ParacadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#paracada}.
	 * @param ctx the parse tree
	 */
	void exitParacada(AtresParser.ParacadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(AtresParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(AtresParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(AtresParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(AtresParser.BlocoContext ctx);
}