import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oq implements of {
   private final og b;
   private final jg<dag> c;
   private final dex d;
   private final dex e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private oq(og $$0, jg<dag> $$1, dex $$2, dex $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static oq a(og $$0, dex $$1, dex $$2, dag $$3) {
      return new oq($$0, $$3.e(), $$1, $$2);
   }

   public oq b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oq b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public dag a() {
      return this.c.a();
   }

   @Override
   public void a(oh $$0, alq<dfb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dgd $$3 = new dgd(Objects.requireNonNullElse(this.g, ""), of.a(this.b), this.d, this.e, new dge(this.c.a()));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alq<dfb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
