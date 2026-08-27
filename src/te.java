import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record te(tf j, tf k) {
   public static final Codec<te> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(tf.a.fieldOf("chat").forGetter(te::a), tf.a.fieldOf("narration").forGetter(te::b)).apply($$0, te::new)
   );
   public static final tf b = tf.a("chat.type.text");
   public static final aet<te> c = a("chat");
   public static final aet<te> d = a("say_command");
   public static final aet<te> e = a("msg_command_incoming");
   public static final aet<te> f = a("msg_command_outgoing");
   public static final aet<te> g = a("team_msg_command_incoming");
   public static final aet<te> h = a("team_msg_command_outgoing");
   public static final aet<te> i = a("emote_command");

   private static aet<te> a(String $$0) {
      return aet.a(je.aq, new aeu($$0));
   }

   public static void a(np<te> $$0) {
      $$0.a(c, new te(b, tf.a("chat.type.text.narrate")));
      $$0.a(d, new te(tf.a("chat.type.announcement"), tf.a("chat.type.text.narrate")));
      $$0.a(e, new te(tf.b("commands.message.display.incoming"), tf.a("chat.type.text.narrate")));
      $$0.a(f, new te(tf.c("commands.message.display.outgoing"), tf.a("chat.type.text.narrate")));
      $$0.a(g, new te(tf.d("chat.type.team.text"), tf.a("chat.type.text.narrate")));
      $$0.a(h, new te(tf.d("chat.type.team.sent"), tf.a("chat.type.text.narrate")));
      $$0.a(i, new te(tf.a("chat.type.emote"), tf.a("chat.type.emote")));
   }

   public static te.a a(aet<te> $$0, bil $$1) {
      return a($$0, $$1.dK().B_(), $$1.H_());
   }

   public static te.a a(aet<te> $$0, dt $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static te.a a(aet<te> $$0, hu $$1, ti $$2) {
      ht<te> $$3 = $$1.d(je.aq);
      return $$3.e($$0).a($$2);
   }

   public te.a a(ti $$0) {
      return new te.a(this, $$0);
   }

   public tf a() {
      return this.j;
   }

   public tf b() {
      return this.k;
   }

   public static record a(te a, ti b, @Nullable ti c) {
      a(te $$0, ti $$1) {
         this($$0, $$1, null);
      }

      public ti a(ti $$0) {
         return this.a.a().a($$0, this);
      }

      public ti b(ti $$0) {
         return this.a.b().a($$0, this);
      }

      public te.a c(ti $$0) {
         return new te.a(this.a, this.b, $$0);
      }

      public te.b a(hu $$0) {
         ht<te> $$1 = $$0.d(je.aq);
         return new te.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, ti b, @Nullable ti c) {
      public b(sl $$0) {
         this($$0.m(), $$0.l(), $$0.c(sl::l));
      }

      public void a(sl $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, sl::a);
      }

      public Optional<te.a> a(hu $$0) {
         ht<te> $$1 = $$0.d(je.aq);
         te $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new te.a($$0x, this.b, this.c));
      }
   }
}
