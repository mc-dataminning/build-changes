public class fzy extends gaf {
   private static final xc a = xc.c("outOfMemory.title");
   private static final xc b = xc.c("outOfMemory.message");
   private static final int c = 300;
   private final fyb d = new fyb(this);

   public fzy() {
      super(a);
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      this.d.c(new fuy(300, b, this.p));
      fyf $$0 = this.d.b(fyf.e().a(8));
      $$0.a(fun.a(xb.l, $$0x -> this.m.a(new gah())).a());
      $$0.a(fun.a(xc.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
