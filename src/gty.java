import java.util.List;

public class gty extends gtn<gxn, gbn> {
   private final all a;
   private final gty.a b;
   private final gty.b c;

   public gty(gqw<gxn, gbn> $$0, all $$1, gty.a $$2, gty.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fek $$0, gix $$1, int $$2, gxn $$3, float $$4, float $$5) {
      if (!$$3.u) {
         this.a();
         feo $$6 = $$1.getBuffer(gjh.j(this.a));
         float $$7 = this.b.apply($$3, $$3.p);
         int $$8 = axy.a(azn.d($$7 * 255.0F), 255, 255, 255);
         this.d().a($$0, $$6, $$2, gqb.a($$3, 0.0F), $$8);
         this.b();
      }
   }

   private void a() {
      List<gcc> $$0 = this.c.getPartsToDraw(this.d());
      this.d().f().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a {
      float apply(gxn var1, float var2);
   }

   public interface b {
      List<gcc> getPartsToDraw(gbn var1);
   }
}
