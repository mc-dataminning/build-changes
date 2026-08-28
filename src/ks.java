import com.mojang.serialization.Codec;

public record ks(da e) implements ku {
   public static final Codec<ks> a = da.a.xmap(ks::new, ks::a);

   @Override
   public boolean a(kg $$0) {
      return this.e.a($$0);
   }

   public static ks a(da $$0) {
      return new ks($$0);
   }

   public da a() {
      return this.e;
   }
}
