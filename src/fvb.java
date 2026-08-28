public class fvb extends fvi {
   private static final wp a = wp.c("outOfMemory.title");
   private static final wp b = wp.c("outOfMemory.message");
   private static final int c = 300;
   private final fte d = new fte(this);

   public fvb() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fqb(300, b, this.p));
      fti $$0 = this.d.b(fti.e().a(8));
      $$0.a(fpq.a(wo.l, $$0x -> this.m.a(new fvk())).a());
      $$0.a(fpq.a(wp.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
