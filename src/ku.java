import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class ku implements dk<dfl> {
   private final List<bs> a;

   protected ku(List<bs> $$0) {
      this.a = $$0;
   }

   public static <T extends ku> Codec<T> a(Function<List<bs>, T> $$0) {
      return bs.a.listOf().xmap($$0, ku::b);
   }

   protected List<bs> b() {
      return this.a;
   }

   public boolean a(dfl $$0) {
      for (bs $$1 : this.a) {
         if (!$$1.a($$0)) {
            return false;
         }
      }

      return true;
   }

   public static ku.a a(List<bs> $$0) {
      return new ku.a($$0);
   }

   public static ku.b b(List<bs> $$0) {
      return new ku.b($$0);
   }

   public static class a extends ku {
      public static final Codec<ku.a> a = a(ku.a::new);

      protected a(List<bs> $$0) {
         super($$0);
      }

      @Override
      public ki<dfl> a() {
         return kj.l;
      }
   }

   public static class b extends ku {
      public static final Codec<ku.b> a = a(ku.b::new);

      protected b(List<bs> $$0) {
         super($$0);
      }

      @Override
      public ki<dfl> a() {
         return kj.J;
      }
   }
}
