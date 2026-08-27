import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rh {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<sc> c;
   @Nullable
   private final Consumer<amz> d;
   @Nullable
   private final Consumer<amz> e;

   public rh(String $$0, Collection<sc> $$1, @Nullable Consumer<amz> $$2, @Nullable Consumer<amz> $$3) {
      if ($$1.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public String a() {
      return this.b;
   }

   public Collection<sc> b() {
      return this.c;
   }

   public void a(amz $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(amz $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
