import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class oa implements ny {
   private final dhy a;
   private final List<oa.b> b = Lists.newArrayList();

   private oa(dhy $$0) {
      this.a = $$0;
   }

   @Override
   public dhy a() {
      return this.a;
   }

   public static oa a(dhy $$0) {
      return new oa($$0);
   }

   public oa a(List<oe> $$0) {
      this.b.add(new oa.b($$0));
      return this;
   }

   public oa a(oe $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public oa a(nz $$0, List<oe> $$1) {
      this.b.add(new oa.a($$0, $$1));
      return this;
   }

   public oa a(nz $$0, oe... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public oa a(nz $$0, oe $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dve<dhy, dvd> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(oa.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends oa.b {
      private final nz a;

      a(nz $$0, List<oe> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dve<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<oe> a;

      b(List<oe> $$0) {
         this.a = $$0;
      }

      public void a(dve<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", oe.a(this.a));
         return $$0;
      }
   }
}
