import java.util.List;

public class fzn extends fzi<cvl> {
   private static final alg G = alg.b("container/blast_furnace/lit_progress");
   private static final alg H = alg.b("container/blast_furnace/burn_progress");
   private static final alg I = alg.b("textures/gui/container/blast_furnace.png");
   private static final wy J = wy.c("gui.recipebook.toggleRecipes.blastable");
   private static final List<gcr.a> K = List.of(new gcr.a(gcx.c), new gcr.a(czr.au, deg.h), new gcr.a(czr.pQ, czr.qE, deg.i));

   public fzn(cvl $$0, crl $$1, wy $$2) {
      super($$0, $$1, $$2, J, I, G, H, K);
   }
}
