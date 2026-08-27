public class fym implements asp {
   private final fyl a;
   private final fyo b;
   private final fxf c;
   private final fyn d;
   private final axd e = axd.a();
   private final fam f;

   public fym(fyl $$0, fxf $$1, fam $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fyo(this.f);
      this.d = new fyn();
   }

   public fyl a() {
      return this.a;
   }

   public void a(dnb $$0, ib $$1, cwe $$2, eub $$3, euf $$4) {
      if ($$0.l() == dgh.c) {
         glc $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, git.d);
      }
   }

   public void a(dnb $$0, ib $$1, cwe $$2, eub $$3, euf $$4, boolean $$5, axd $$6) {
      try {
         dgh $$7 = $$0.l();
         if ($$7 == dgh.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), git.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(ib $$0, cwe $$1, euf $$2, dnb $$3, eip $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fyo b() {
      return this.b;
   }

   public glc a(dnb $$0) {
      return this.a.b($$0);
   }

   public void a(dnb $$0, eub $$1, fxs $$2, int $$3, int $$4) {
      dgh $$5 = $$0.l();
      if ($$5 != dgh.a) {
         switch ($$5) {
            case c:
               glc $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fxn.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cqm($$0.b()), cqj.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aso $$0) {
      this.d.a();
   }
}
