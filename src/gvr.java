public class gvr extends gwq<gxx, gbk> {
   private static final aku a = aku.b("textures/entity/cat/cat_collar.png");
   private final gbk b;
   private final gbk c;

   public gvr(gty<gxx, gbk> $$0, gew $$1) {
      super($$0);
      this.b = new gbk($$1.a(gez.R));
      this.c = new gbk($$1.a(gez.Q));
   }

   public void a(ffs $$0, glv $$1, int $$2, gxx $$3, float $$4, float $$5) {
      cvk $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gbk $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
