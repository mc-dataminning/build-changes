import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class ma implements ly {
   private final cvz a;
   private final List<ma.b> b = Lists.newArrayList();

   private ma(cvz $$0) {
      this.a = $$0;
   }

   @Override
   public cvz a() {
      return this.a;
   }

   public static ma a(cvz $$0) {
      return new ma($$0);
   }

   public ma a(List<me> $$0) {
      this.b.add(new ma.b($$0));
      return this;
   }

   public ma a(me $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public ma a(lz $$0, List<me> $$1) {
      this.b.add(new ma.a($$0, $$1));
      return this;
   }

   public ma a(lz $$0, me... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public ma a(lz $$0, me $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      diq<cvz, dip> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(ma.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends ma.b {
      private final lz a;

      a(lz $$0, List<me> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(diq<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<me> a;

      b(List<me> $$0) {
         this.a = $$0;
      }

      public void a(diq<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", me.a(this.a));
         return $$0;
      }
   }
}
