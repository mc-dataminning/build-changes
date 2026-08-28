import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hel implements hev<duj> {
   private final gpe a;
   private final cwe b;

   public hel(cwe $$0, gpe $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public duj a(cxh $$0) {
      return $$0.a(kv.ak);
   }

   public void a(@Nullable duj $$0, cxf $$1, fgr $$2, gmx $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, duj.a));
   }

   public static record a(cwe b) implements hev.a {
      public static final MapCodec<hel.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwe.q.fieldOf("color").forGetter(hel.a::b)).apply($$0, hel.a::new));

      @Override
      public MapCodec<hel.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         return new hel(this.b, new gpe($$0));
      }
   }
}
