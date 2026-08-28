public class gwc implements gwh {
   private static final int a = 6000;
   private static final wz b = wz.c("tutorial.find_tree.title");
   private static final wz c = wz.c("tutorial.find_tree.description");
   private final gwg d;
   private fkv e;
   private int f;

   public gwc(gwg $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwi.f);
      } else {
         if (this.f == 1) {
            gdz $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gwi.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fkv(fkv.a.c, b, c, false);
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
   public void a(fzd $$0, ewy $$1) {
      if ($$1.c() == ewy.a.b) {
         dtc $$2 = $$0.a_(((eww)$$1).a());
         if ($$2.a(awe.aj)) {
            this.d.a(gwi.c);
         }
      }
   }

   @Override
   public void a(cuq $$0) {
      if ($$0.a(awn.aM)) {
         this.d.a(gwi.e);
      }
   }

   private static boolean b(gdz $$0) {
      return $$0.fZ().a_($$0x -> $$0x.a(awn.aM));
   }

   public static boolean a(gdz $$0) {
      for (jm<dfy> $$1 : lt.e.c(awe.aj)) {
         dfy $$2 = $$1.a();
         if ($$0.j().a(avz.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
