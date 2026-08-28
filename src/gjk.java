public class gjk implements avc {
   private final gjj a;
   private final gjm b;
   private final gho c;
   private final gjl d;
   private final azs e = azs.a();
   private final fkk f;

   public gjk(gjj $$0, gho $$1, fkk $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gjm(this.f);
      this.d = new gjl();
   }

   public gjj a() {
      return this.a;
   }

   public void a(dvj $$0, jh $$1, ded $$2, feb $$3, fef $$4) {
      if ($$0.o() == dok.c) {
         haf $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gxu.d);
      }
   }

   public void a(dvj $$0, jh $$1, ded $$2, feb $$3, fef $$4, boolean $$5, azs $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), gxu.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jh $$0, ded $$1, fef $$2, dvj $$3, erk $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gjm b() {
      return this.b;
   }

   public haf a(dvj $$0) {
      return this.a.b($$0);
   }

   public void a(dvj $$0, feb $$1, gih $$2, int $$3, int $$4) {
      dok $$5 = $$0.o();
      if ($$5 != dok.a) {
         switch ($$5) {
            case c:
               haf $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(ghz.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cwb($$0.b()), cvz.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(avb $$0) {
      this.d.a();
   }
}
