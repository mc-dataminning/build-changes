import java.util.Collection;

public record sk(int a, Collection<sr> b, jg<tm> c) {
   public sk(int a, Collection<sr> b, jg<tm> c) {
      if (b.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
      } else {
         this.a = a;
         this.b = b;
         this.c = c;
      }
   }
}
