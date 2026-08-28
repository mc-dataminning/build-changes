import java.util.Map;

public class gzh extends gyt<hcz, ggs> {
   private final ggs a;
   private final ggs b;
   private final gye c;
   private static final Map<bvo.a, ald> d = Map.of(
      bvo.a.b,
      ald.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bvo.a.c,
      ald.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bvo.a.d,
      ald.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gzh(gwc<hcz, ggs> $$0, ggz $$1, gye $$2) {
      super($$0);
      this.a = new ggs($$1.a(ghc.dU));
      this.b = new ggs($$1.a(ghc.dW));
      this.c = $$2;
   }

   public void a(fho $$0, gny $$1, int $$2, hcz $$3, float $$4, float $$5) {
      cxy $$6 = $$3.i;
      dgc $$7 = $$6.a(kx.E);
      if ($$7 != null && !$$7.d().isEmpty()) {
         ggs $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hiy.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fho $$0, gny $$1, int $$2, cxy $$3, gew $$4) {
      bvo.a $$5 = bvo.b.a($$3);
      if ($$5 != bvo.a.a) {
         ald $$6 = d.get($$5);
         fhs $$7 = $$1.getBuffer(goi.c($$6));
         $$4.a($$0, $$7, $$2, hgi.d);
      }
   }
}
