public class fun implements aqk {
   private final fum a;
   private final fup b;
   private final ftg c;
   private final fuo d;
   private final auw e = auw.a();
   private final ewv f;

   public fun(fum $$0, ftg $$1, ewv $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fup(this.f);
      this.d = new fuo();
   }

   public fum a() {
      return this.a;
   }

   public void a(djp $$0, hx $$1, cta $$2, eqk $$3, eqo $$4) {
      if ($$0.l() == ddd.c) {
         ghb $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, ges.d);
      }
   }

   public void a(djp $$0, hx $$1, cta $$2, eqk $$3, eqo $$4, boolean $$5, auw $$6) {
      try {
         ddd $$7 = $$0.l();
         if ($$7 == ddd.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), ges.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hx $$0, cta $$1, eqo $$2, djp $$3, eez $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fup b() {
      return this.b;
   }

   public ghb a(djp $$0) {
      return this.a.b($$0);
   }

   public void a(djp $$0, eqk $$1, ftt $$2, int $$3, int $$4) {
      ddd $$5 = $$0.l();
      if ($$5 != ddd.a) {
         switch ($$5) {
            case c:
               ghb $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fto.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cng($$0.b()), cnd.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aqj $$0) {
      this.d.a();
   }
}
