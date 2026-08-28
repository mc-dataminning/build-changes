import java.util.List;
import javax.annotation.Nullable;

public abstract class hgo implements hgl {
   protected final hgl a;

   public hgo(hgl $$0) {
      this.a = $$0;
   }

   @Override
   public List<gne> a(@Nullable dwx $$0, @Nullable jn $$1, azh $$2) {
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
   public hej d() {
      return this.a.d();
   }

   @Override
   public gno e() {
      return this.a.e();
   }
}
