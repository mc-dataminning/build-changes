import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record kt(cx.d e, cx.d f) implements ku {
   public static final Codec<kt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cx.d.d.optionalFieldOf("durability", cx.d.c).forGetter(kt::a), cx.d.d.optionalFieldOf("damage", cx.d.c).forGetter(kt::b))
            .apply($$0, kt::new)
   );

   @Override
   public boolean a(kg $$0) {
      Integer $$1 = $$0.a(kl.e);
      if ($$1 == null) {
         return false;
      } else {
         int $$2 = $$0.a(kl.d, 0);
         return !this.e.d($$2 - $$1) ? false : this.f.d($$1);
      }
   }

   public static kt a(cx.d $$0) {
      return new kt($$0, cx.d.c);
   }

   public cx.d a() {
      return this.e;
   }

   public cx.d b() {
      return this.f;
   }
}
