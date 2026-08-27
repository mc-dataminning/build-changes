import java.util.List;

public class gdx<T extends ceu, M extends fmv<T>> extends gdl<T, M> {
   private final ahh a;
   private final gdx.a<T> b;
   private final gdx.b<T, M> c;

   public gdx(gav<T, M> $$0, ahh $$1, gdx.a<T> $$2, gdx.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         eqo $$10 = $$1.getBuffer(fub.j(this.a));
         this.c().a($$0, $$10, $$2, gab.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fnj> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends ceu> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends ceu, M extends fkj<T>> {
      List<fnj> getPartsToDraw(M var1);
   }
}
