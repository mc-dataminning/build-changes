import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class me implements mc {
   private final cwy a;
   private final List<me.b> b = Lists.newArrayList();

   private me(cwy $$0) {
      this.a = $$0;
   }

   @Override
   public cwy a() {
      return this.a;
   }

   public static me a(cwy $$0) {
      return new me($$0);
   }

   public me a(List<mi> $$0) {
      this.b.add(new me.b($$0));
      return this;
   }

   public me a(mi $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public me a(md $$0, List<mi> $$1) {
      this.b.add(new me.a($$0, $$1));
      return this;
   }

   public me a(md $$0, mi... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public me a(md $$0, mi $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      djq<cwy, djp> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(me.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends me.b {
      private final md a;

      a(md $$0, List<mi> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(djq<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<mi> a;

      b(List<mi> $$0) {
         this.a = $$0;
      }

      public void a(djq<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", mi.a(this.a));
         return $$0;
      }
   }
}
