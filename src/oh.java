import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class oh implements of {
   private final dke a;
   private final List<oh.b> b = Lists.newArrayList();

   private oh(dke $$0) {
      this.a = $$0;
   }

   @Override
   public dke a() {
      return this.a;
   }

   public static oh a(dke $$0) {
      return new oh($$0);
   }

   public oh a(List<ol> $$0) {
      this.b.add(new oh.b($$0));
      return this;
   }

   public oh a(ol $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public oh a(og $$0, List<ol> $$1) {
      this.b.add(new oh.a($$0, $$1));
      return this;
   }

   public oh a(og $$0, ol... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public oh a(og $$0, ol $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dxo<dke, dxn> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(oh.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends oh.b {
      private final og a;

      a(og $$0, List<ol> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dxo<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<ol> a;

      b(List<ol> $$0) {
         this.a = $$0;
      }

      public void a(dxo<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", ol.a(this.a));
         return $$0;
      }
   }
}
