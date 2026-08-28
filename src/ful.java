import java.util.List;
import javax.annotation.Nullable;

public class ful implements fwy {
   private static final int a = 170;
   private final wy b;
   @Nullable
   private List<ayy> c;
   @Nullable
   private tu d;
   @Nullable
   private final wy e;

   private ful(wy $$0, @Nullable wy $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static ful a(wy $$0, @Nullable wy $$1) {
      return new ful($$0, $$1);
   }

   public static ful a(wy $$0) {
      return new ful($$0, $$0);
   }

   @Override
   public void b(fwx $$0) {
      if (this.e != null) {
         $$0.a(fww.c, this.e);
      }
   }

   public List<ayy> a(fpt $$0) {
      tu $$1 = tu.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayy> a(fpt $$0, wy $$1) {
      return $$0.h.c($$1, 170);
   }
}
