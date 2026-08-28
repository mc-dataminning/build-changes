import java.util.List;

public class gti extends gsx<gwx, gax> {
   private final ali a;
   private final gti.a b;
   private final gti.b c;

   public gti(gqg<gwx, gax> $$0, ali $$1, gti.a $$2, gti.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(feb $$0, gih $$1, int $$2, gwx $$3, float $$4, float $$5) {
      if (!$$3.u) {
         this.a();
         fef $$6 = $$1.getBuffer(gir.j(this.a));
         float $$7 = this.b.apply($$3, $$3.p);
         int $$8 = axv.a(azk.d($$7 * 255.0F), 255, 255, 255);
         this.d().a($$0, $$6, $$2, gpl.a($$3, 0.0F), $$8);
         this.b();
      }
   }

   private void a() {
      List<gbm> $$0 = this.c.getPartsToDraw(this.d());
      this.d().f().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a {
      float apply(gwx var1, float var2);
   }

   public interface b {
      List<gbm> getPartsToDraw(gax var1);
   }
}
