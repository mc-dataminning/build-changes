import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hhv implements hib<dyn> {
   private final gsv a;

   public hhv(gsv $$0) {
      this.a = $$0;
   }

   @Nullable
   public dyn a(czd $$0) {
      return $$0.a(kj.ao);
   }

   public void a(@Nullable dyn $$0, czb $$1, fjj $$2, gqa $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dyn.a));
   }

   public static record a() implements hib.a {
      public static final MapCodec<hhv.a> a = MapCodec.unit(new hhv.a());

      @Override
      public MapCodec<hhv.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         return new hhv(new gsv($$0));
      }
   }
}
