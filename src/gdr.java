public class gdr implements gdw {
   private static final int a = 6000;
   private static final te b = te.c("tutorial.find_tree.title");
   private static final te c = te.c("tutorial.find_tree.description");
   private final gdv d;
   private eul e;
   private int f;

   public gdr(gdv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gdx.f);
      } else {
         if (this.f == 1) {
            fmi $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gdx.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new eul(eul.a.c, b, c, false);
            this.d.e().ay().a(this.e);
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
   public void a(fie $$0, ehd $$1) {
      if ($$1.c() == ehd.a.b) {
         dey $$2 = $$0.a_(((ehb)$$1).a());
         if ($$2.a(apj.ai)) {
            this.d.a(gdx.c);
         }
      }
   }

   @Override
   public void a(ciw $$0) {
      if ($$0.a(apr.al)) {
         this.d.a(gdx.e);
      }
   }

   private static boolean b(fmi $$0) {
      return $$0.fQ().a_($$0x -> $$0x.a(apr.al));
   }

   public static boolean a(fmi $$0) {
      for (hf<csk> $$1 : jc.f.c(apj.ai)) {
         csk $$2 = $$1.a();
         if ($$0.j().a(ape.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
