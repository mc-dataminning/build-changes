public class gwe implements gwj {
   private static final int a = 6000;
   private static final wz b = wz.c("tutorial.find_tree.title");
   private static final wz c = wz.c("tutorial.find_tree.description");
   private final gwi d;
   private fkx e;
   private int f;

   public gwe(gwi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwk.f);
      } else {
         if (this.f == 1) {
            geb $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gwk.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fkx(fkx.a.c, b, c, false);
            this.d.e().aw().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(fzf $$0, exa $$1) {
      if ($$1.c() == exa.a.b) {
         dtc $$2 = $$0.a_(((ewy)$$1).a());
         if ($$2.a(awe.ak)) {
            this.d.a(gwk.c);
         }
      }
   }

   @Override
   public void a(cuq $$0) {
      if ($$0.a(awn.aM)) {
         this.d.a(gwk.e);
      }
   }

   private static boolean b(geb $$0) {
      return $$0.fY().a_($$0x -> $$0x.a(awn.aM));
   }

   public static boolean a(geb $$0) {
      for (jm<dfy> $$1 : lt.e.c(awe.ak)) {
         dfy $$2 = $$1.a();
         if ($$0.j().a(avz.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
