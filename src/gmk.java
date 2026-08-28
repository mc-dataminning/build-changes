import org.joml.Vector3f;

public class gmk extends gml<ls> {
   protected gmk(gjz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ls $$7, god $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      float $$9 = this.r.i() * 0.4F + 0.6F;
      Vector3f $$10 = $$7.b();
      this.v = this.a($$10.x(), $$9);
      this.w = this.a($$10.y(), $$9);
      this.x = this.a($$10.z(), $$9);
   }

   public static class a implements gnl<ls> {
      private final god a;

      public a(god $$0) {
         this.a = $$0;
      }

      public gni a(ls $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmk($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
