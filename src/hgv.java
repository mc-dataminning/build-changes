import java.util.List;
import javax.annotation.Nullable;

public abstract class hgv implements hgr {
   protected final hgr a;

   public hgv(hgr $$0) {
      this.a = $$0;
   }

   @Override
   public List<gne> a(@Nullable dww $$0, @Nullable jn $$1, azh $$2) {
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
   public her d() {
      return this.a.d();
   }

   @Override
   public gno e() {
      return this.a.e();
   }
}
