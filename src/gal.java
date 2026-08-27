import javax.annotation.Nullable;

public class gal extends fzs<ccu, flp<ccu>> {
   private static final ahg a = new ahg("textures/" + ftv.i.b().a() + ".png");
   private static final ahg[] i = ftv.j.stream().map($$0 -> new ahg("textures/" + $$0.b().a() + ".png")).toArray(ahg[]::new);

   public gal(fym.a $$0) {
      super($$0, new flp<>($$0.a(fmv.bh)), 0.0F);
      this.a(new gda(this));
   }

   public els a(ccu $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(ccu $$0, fwj $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bly<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         els $$6 = els.c($$0.dm());
         return $$1.a(new eln($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ahg a(ccu $$0) {
      return a($$0.gf());
   }

   public static ahg a(@Nullable cll $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(ccu $$0, eqa $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.A().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
