import java.util.List;
import javax.annotation.Nullable;

public class hmg implements gry {
   private final bsq<gry> a;
   private final boolean b;
   private final hjk c;

   public hmg(bsq<gry> $$0) {
      this.a = $$0;
      gry $$1 = $$0.d().getFirst().a();
      this.b = $$1.a();
      this.c = $$1.b();
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hjk b() {
      return this.c;
   }

   @Override
   public List<grs> a(eao $$0, @Nullable jb $$1, azv $$2) {
      return this.a.b($$2).a($$0, $$1, $$2);
   }
}
