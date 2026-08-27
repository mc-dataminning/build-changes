import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class lw implements lu {
   private final cut a;
   private final List<lw.b> b = Lists.newArrayList();

   private lw(cut $$0) {
      this.a = $$0;
   }

   @Override
   public cut a() {
      return this.a;
   }

   public static lw a(cut $$0) {
      return new lw($$0);
   }

   public lw a(List<ma> $$0) {
      this.b.add(new lw.b($$0));
      return this;
   }

   public lw a(ma $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public lw a(lv $$0, List<ma> $$1) {
      this.b.add(new lw.a($$0, $$1));
      return this;
   }

   public lw a(lv $$0, ma... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public lw a(lv $$0, ma $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dgx<cut, dgw> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(lw.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends lw.b {
      private final lv a;

      a(lv $$0, List<ma> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dgx<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<ma> a;

      b(List<ma> $$0) {
         this.a = $$0;
      }

      public void a(dgx<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", ma.a(this.a));
         return $$0;
      }
   }
}
