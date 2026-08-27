import javax.annotation.Nullable;

public class fun extends ftu<bzh, fgh<bzh>> {
   private static final aer a = new aer("textures/" + fnz.i.b().a() + ".png");
   private static final aer[] i = fnz.j.stream().map($$0 -> new aer("textures/" + $$0.b().a() + ".png")).toArray(aer[]::new);

   public fun(fso.a $$0) {
      super($$0, new fgh<>($$0.a(fhm.be)), 0.0F);
      this.a(new fwz(this));
   }

   public ehe a(bzh $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(bzh $$0, fqn $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bim<?> $$3x = $$0.ag();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ehe $$6 = ehe.c($$0.dk());
         return $$1.a(new egz($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aer a(bzh $$0) {
      return a($$0.ga());
   }

   public static aer a(@Nullable chm $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(bzh $$0, elg $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.t().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
