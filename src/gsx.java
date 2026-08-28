import java.util.List;

public class gsx extends gsm<gwm, gam> {
   private final alh a;
   private final gsx.a b;
   private final gsx.b c;

   public gsx(gpv<gwm, gam> $$0, alh $$1, gsx.a $$2, gsx.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fdt $$0, ghw $$1, int $$2, gwm $$3, float $$4, float $$5) {
      if (!$$3.u) {
         this.a();
         fdx $$6 = $$1.getBuffer(gig.j(this.a));
         float $$7 = this.b.apply($$3, $$3.p);
         int $$8 = axu.a(azj.d($$7 * 255.0F), 255, 255, 255);
         this.d().a($$0, $$6, $$2, gpa.a($$3, 0.0F), $$8);
         this.b();
      }
   }

   private void a() {
      List<gbb> $$0 = this.c.getPartsToDraw(this.d());
      this.d().f().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a {
      float apply(gwm var1, float var2);
   }

   public interface b {
      List<gbb> getPartsToDraw(gam var1);
   }
}
