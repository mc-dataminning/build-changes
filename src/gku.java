import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gku {
   private final gkw[] a;
   private int b;

   public static Codec<gku> a(int $$0) {
      return Codec.list(gkw.a)
         .comapFlatMap(
            $$1 -> {
               int $$2 = $$1.size();
               return $$2 > $$0
                  ? DataResult.error(() -> "Expected: a buffer of size less than or equal to " + $$0 + " but: " + $$2 + " is greater than " + $$0)
                  : DataResult.success(new gku($$0, $$1));
            },
            gku::c
         );
   }

   public gku(int $$0) {
      this.a = new gkw[$$0];
   }

   private gku(int $$0, List<gkw> $$1) {
      this.a = $$1.toArray(gkw[]::new);
      this.b = $$1.size();
   }

   private List<gkw> c() {
      List<gkw> $$0 = new ArrayList<>(this.d());

      for (int $$1 = this.a(); $$1 <= this.b(); $$1++) {
         $$0.add(this.b($$1));
      }

      return $$0;
   }

   public void a(gkw $$0) {
      this.a[this.c(this.b++)] = $$0;
   }

   @Nullable
   public gkw b(int $$0) {
      return $$0 >= this.a() && $$0 <= this.b() ? this.a[this.c($$0)] : null;
   }

   private int c(int $$0) {
      return $$0 % this.a.length;
   }

   public int a() {
      return Math.max(this.b - this.a.length, 0);
   }

   public int b() {
      return this.b - 1;
   }

   private int d() {
      return this.b() - this.a() + 1;
   }
}
