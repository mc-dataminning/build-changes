import javax.annotation.Nullable;

public class glo extends gku<cjx, fwj<cjx>> {
   private static final akk a = new akk("textures/" + geu.i.b().a() + ".png");
   private static final akk[] i = geu.j.stream().map($$0 -> new akk("textures/" + $$0.b().a() + ".png")).toArray(akk[]::new);

   public glo(gjo.a $$0) {
      super($$0, new fwj<>($$0.a(fxp.bk)), 0.0F);
      this.a(new god(this));
   }

   public ewh a(cjx $$0, float $$1) {
      return $$0.I($$1).orElse(super.a($$0, $$1)).a((double)$$0.ed());
   }

   public boolean a(cjx $$0, ghj $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.I(0.0F).filter($$2x -> {
         bsn<?> $$3x = $$0.am();
         float $$4x = $$3x.m() / 2.0F;
         float $$5 = $$3x.l() / 2.0F;
         ewh $$6 = ewh.c($$0.dr());
         return $$1.a(new ewc($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public akk a(cjx $$0) {
      return a($$0.go());
   }

   public static akk a(@Nullable csw $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cjx $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.x().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
