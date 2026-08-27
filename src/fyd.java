import java.util.List;

public class fyd<T extends cba, M extends fhr<T>> extends fxr<T, M> {
   private final aey a;
   private final fyd.a<T> b;
   private final fyd.b<T, M> c;

   public fyd(fve<T, M> $$0, aey $$1, fyd.a<T> $$2, fyd.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         elv $$10 = $$1.getBuffer(foo.j(this.a));
         this.c().a($$0, $$10, $$2, fuk.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fie> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cba> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cba, M extends fff<T>> {
      List<fie> getPartsToDraw(M var1);
   }
}
