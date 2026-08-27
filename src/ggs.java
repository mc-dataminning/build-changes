public class ggs implements ggx {
   private static final int a = 6000;
   private static final ur b = ur.c("tutorial.find_tree.title");
   private static final ur c = ur.c("tutorial.find_tree.description");
   private final ggw d;
   private eww e;
   private int f;

   public ggs(ggw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ggy.f);
      } else {
         if (this.f == 1) {
            fpj $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(ggy.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new eww(eww.a.c, b, c, false);
            this.d.e().ax().a(this.e);
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
   public void a(fkw $$0, ejg $$1) {
      if ($$1.c() == ejg.a.b) {
         dgw $$2 = $$0.a_(((eje)$$1).a());
         if ($$2.a(arc.ai)) {
            this.d.a(ggy.c);
         }
      }
   }

   @Override
   public void a(clb $$0) {
      if ($$0.a(ark.al)) {
         this.d.a(ggy.e);
      }
   }

   private static boolean b(fpj $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(ark.al));
   }

   public static boolean a(fpj $$0) {
      for (ib<cut> $$1 : jy.f.c(arc.ai)) {
         cut $$2 = $$1.a();
         if ($$0.j().a(aqx.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
