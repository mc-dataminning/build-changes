import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gjy {
   private final gka[] a;
   private int b;

   public static Codec<gjy> a(int $$0) {
      return Codec.list(gka.a)
         .comapFlatMap(
            $$1 -> {
               int $$2 = $$1.size();
               return $$2 > $$0
                  ? DataResult.error(() -> "Expected: a buffer of size less than or equal to " + $$0 + " but: " + $$2 + " is greater than " + $$0)
                  : DataResult.success(new gjy($$0, $$1));
            },
            gjy::c
         );
   }

   public gjy(int $$0) {
      this.a = new gka[$$0];
   }

   private gjy(int $$0, List<gka> $$1) {
      this.a = $$1.toArray(gka[]::new);
      this.b = $$1.size();
   }

   private List<gka> c() {
      List<gka> $$0 = new ArrayList<>(this.d());

      for (int $$1 = this.a(); $$1 <= this.b(); $$1++) {
         $$0.add(this.b($$1));
      }

      return $$0;
   }

   public void a(gka $$0) {
      this.a[this.c(this.b++)] = $$0;
   }

   @Nullable
   public gka b(int $$0) {
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
