import com.mojang.serialization.MapCodec;

public class wu implements ww {
   public static final wu a = new wu();
   public static final wx<wu> b = new wx<wu>() {
      private static final MapCodec<wu> a = MapCodec.unit(wu.a);

      @Override
      public MapCodec<wu> a() {
         return a;
      }

      public void a(uj $$0, wu $$1) {
      }

      public wu a(uj $$0) {
         return wu.a;
      }
   };

   @Override
   public vu a(int $$0) {
      return vg.i();
   }

   @Override
   public wx<wu> a() {
      return b;
   }
}
