import java.util.Collection;

public record sj(int a, Collection<sq> b, jf<tl> c) {
   public sj(int a, Collection<sq> b, jf<tl> c) {
      if (b.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
      } else {
         this.a = a;
         this.b = b;
         this.c = c;
      }
   }
}
