import java.util.List;

public class gsh extends grw<gvv, fzw> {
   private final alc a;
   private final gsh.a b;
   private final gsh.b c;

   public gsh(gpf<gvv, fzw> $$0, alc $$1, gsh.a $$2, gsh.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fde $$0, ghg $$1, int $$2, gvv $$3, float $$4, float $$5) {
      if (!$$3.u) {
         this.a();
         fdi $$6 = $$1.getBuffer(ghq.j(this.a));
         float $$7 = this.b.apply($$3, $$3.p);
         int $$8 = axo.a(azd.d($$7 * 255.0F), 255, 255, 255);
         this.d().a($$0, $$6, $$2, gok.a($$3, 0.0F), $$8);
         this.b();
      }
   }

   private void a() {
      List<gal> $$0 = this.c.getPartsToDraw(this.d());
      this.d().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.d().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a {
      float apply(gvv var1, float var2);
   }

   public interface b {
      List<gal> getPartsToDraw(fzw var1);
   }
}
