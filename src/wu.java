import com.mojang.serialization.MapCodec;

public class wu implements wv {
   public static final ww<wu> a = new ww<wu>() {
      private static final MapCodec<wu> a = vh.a.fieldOf("value").xmap(wu::new, $$0 -> $$0.b);

      @Override
      public MapCodec<wu> a() {
         return a;
      }

      public void a(ui $$0, wu $$1) {
         $$0.a($$1.b);
      }

      public wu a(ui $$0) {
         vf $$1 = $$0.m();
         return new wu($$1);
      }
   };
   final vf b;

   public wu(vf $$0) {
      this.b = $$0;
   }

   @Override
   public vt a(int $$0) {
      return this.b.f();
   }

   @Override
   public ww<wu> a() {
      return a;
   }
}
