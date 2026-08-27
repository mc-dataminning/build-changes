public class ggq<T extends box> extends ggj<T, foj<T>> {
   public static final ajc a = new ajc("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fqf c;

   public ggq(gdt<T, foj<T>> $$0, fqb $$1) {
      super($$0);
      fqf $$2 = $$1.a(fqe.aV);
      this.c = $$2.b("box");
   }

   public static fql a() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("box", fqk.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fqh.a);
      return fql.a($$0, 64, 64);
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fl()) {
         eth $$10 = $$1.getBuffer(fwy.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, ghq.d);
            $$0.b();
         }
      }
   }
}
