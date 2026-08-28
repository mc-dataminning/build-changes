import java.util.List;
import javax.annotation.Nullable;

public abstract class hgp implements hgm {
   protected final hgm a;

   public hgp(hgm $$0) {
      this.a = $$0;
   }

   @Override
   public List<gnc> a(@Nullable dwv $$0, @Nullable jn $$1, azg $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.a.b();
   }

   @Override
   public boolean c() {
      return this.a.c();
   }

   @Override
   public hem d() {
      return this.a.d();
   }

   @Override
   public gnm e() {
      return this.a.e();
   }
}
