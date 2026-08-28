import com.mojang.serialization.Codec;

public record kr(cz c) implements kt {
   public static final Codec<kr> a = cz.a.xmap(kr::new, kr::a);

   @Override
   public boolean a(kf $$0) {
      return this.c.a($$0);
   }

   public static kr a(cz $$0) {
      return new kr($$0);
   }

   public cz a() {
      return this.c;
   }
}
