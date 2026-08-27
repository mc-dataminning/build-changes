import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class kw implements ku {
   private final csk a;
   private final List<kw.b> b = Lists.newArrayList();

   private kw(csk $$0) {
      this.a = $$0;
   }

   @Override
   public csk a() {
      return this.a;
   }

   public static kw a(csk $$0) {
      return new kw($$0);
   }

   public kw a(List<la> $$0) {
      this.b.add(new kw.b($$0));
      return this;
   }

   public kw a(la $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public kw a(kv $$0, List<la> $$1) {
      this.b.add(new kw.a($$0, $$1));
      return this;
   }

   public kw a(kv $$0, la... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public kw a(kv $$0, la $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dez<csk, dey> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(kw.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends kw.b {
      private final kv a;

      a(kv $$0, List<la> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dez<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<la> a;

      b(List<la> $$0) {
         this.a = $$0;
      }

      public void a(dez<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", la.a(this.a));
         return $$0;
      }
   }
}
