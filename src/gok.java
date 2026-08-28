import java.util.List;

public class gok<T extends clo, M extends fxa<T>> extends gny<T, M> {
   private final akk a;
   private final gok.a<T> b;
   private final gok.b<T, M> c;

   public gok(gli<T, M> $$0, akk $$1, gok.a<T> $$2, gok.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         this.a();
         faq $$10 = $$1.getBuffer(gel.j(this.a));
         this.c().a($$0, $$10, $$2, gkn.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fxo> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends clo> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends clo, M extends fuo<T>> {
      List<fxo> getPartsToDraw(M var1);
   }
}
