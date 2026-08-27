import javax.annotation.Nullable;

public class fvg extends fun<bzo, fgw<bzo>> {
   private static final aex a = new aex("textures/" + fot.i.b().a() + ".png");
   private static final aex[] i = fot.j.stream().map($$0 -> new aex("textures/" + $$0.b().a() + ".png")).toArray(aex[]::new);

   public fvg(fth.a $$0) {
      super($$0, new fgw<>($$0.a(fib.be)), 0.0F);
      this.a(new fxs(this));
   }

   public ehn a(bzo $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(bzo $$0, frg $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         biu<?> $$3x = $$0.ah();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ehn $$6 = ehn.c($$0.dl());
         return $$1.a(new ehi($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aex a(bzo $$0) {
      return a($$0.ge());
   }

   public static aex a(@Nullable cht $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(bzo $$0, elp $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.y().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
