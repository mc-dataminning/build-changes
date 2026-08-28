import java.util.List;

public class gsm extends gsb<gwa, gab> {
   private final ale a;
   private final gsm.a b;
   private final gsm.b c;

   public gsm(gpk<gwa, gab> $$0, ale $$1, gsm.a $$2, gsm.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fdi $$0, ghl $$1, int $$2, gwa $$3, float $$4, float $$5) {
      if (!$$3.u) {
         this.a();
         fdm $$6 = $$1.getBuffer(ghv.j(this.a));
         float $$7 = this.b.apply($$3, $$3.p);
         int $$8 = axq.a(azf.d($$7 * 255.0F), 255, 255, 255);
         this.d().a($$0, $$6, $$2, gop.a($$3, 0.0F), $$8);
         this.b();
      }
   }

   private void a() {
      List<gaq> $$0 = this.c.getPartsToDraw(this.d());
      this.d().f().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a {
      float apply(gwa var1, float var2);
   }

   public interface b {
      List<gaq> getPartsToDraw(gab var1);
   }
}
