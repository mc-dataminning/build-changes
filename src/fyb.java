import java.util.List;

public class fyb<T extends cay, M extends fhp<T>> extends fxp<T, M> {
   private final aex a;
   private final fyb.a<T> b;
   private final fyb.b<T, M> c;

   public fyb(fvc<T, M> $$0, aex $$1, fyb.a<T> $$2, fyb.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         elt $$10 = $$1.getBuffer(fom.j(this.a));
         this.c().a($$0, $$10, $$2, fui.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fic> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cay> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cay, M extends ffd<T>> {
      List<fic> getPartsToDraw(M var1);
   }
}
