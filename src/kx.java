import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class kx implements kv {
   private final csq a;
   private final List<kx.b> b = Lists.newArrayList();

   private kx(csq $$0) {
      this.a = $$0;
   }

   @Override
   public csq a() {
      return this.a;
   }

   public static kx a(csq $$0) {
      return new kx($$0);
   }

   public kx a(List<lb> $$0) {
      this.b.add(new kx.b($$0));
      return this;
   }

   public kx a(lb $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public kx a(kw $$0, List<lb> $$1) {
      this.b.add(new kx.a($$0, $$1));
      return this;
   }

   public kx a(kw $$0, lb... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public kx a(kw $$0, lb $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dff<csq, dfe> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(kx.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends kx.b {
      private final kw a;

      a(kw $$0, List<lb> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dff<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<lb> a;

      b(List<lb> $$0) {
         this.a = $$0;
      }

      public void a(dff<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", lb.a(this.a));
         return $$0;
      }
   }
}
