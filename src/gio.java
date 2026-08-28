public class gio implements auw {
   private final gin a;
   private final giq b;
   private final ggs c;
   private final gip d;
   private final azn e = azn.a();
   private final fjr f;

   public gio(gin $$0, ggs $$1, fjr $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new giq(this.f);
      this.d = new gip();
   }

   public gin a() {
      return this.a;
   }

   public void a(dus $$0, jf $$1, ddl $$2, fdi $$3, fdm $$4) {
      if ($$0.o() == dnt.c) {
         gzi $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gwx.d);
      }
   }

   public void a(dus $$0, jf $$1, ddl $$2, fdi $$3, fdm $$4, boolean $$5, azn $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), gwx.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jf $$0, ddl $$1, fdm $$2, dus $$3, eqt $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public giq b() {
      return this.b;
   }

   public gzi a(dus $$0) {
      return this.a.b($$0);
   }

   public void a(dus $$0, fdi $$1, ghl $$2, int $$3, int $$4) {
      dnt $$5 = $$0.o();
      if ($$5 != dnt.a) {
         switch ($$5) {
            case c:
               gzi $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(ghd.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cvs($$0.b()), cvp.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(auv $$0) {
      this.d.a();
   }
}
